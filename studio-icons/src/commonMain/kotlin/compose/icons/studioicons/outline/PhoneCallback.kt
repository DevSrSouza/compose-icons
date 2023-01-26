package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PhoneCallback: ImageVector
    get() {
        if (_phoneCallback != null) {
            return _phoneCallback!!
        }
        _phoneCallback = Builder(name = "PhoneCallback", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.51f)
                curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f)
                curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.49f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.03f, 5.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.07f, 0.89f, 0.22f, 1.76f, 0.46f, 2.59f)
                lineToRelative(-1.2f, 1.2f)
                curveToRelative(-0.41f, -1.2f, -0.67f, -2.47f, -0.76f, -3.79f)
                close()
                moveTo(19.0f, 18.97f)
                curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f)
                lineToRelative(1.19f, -1.19f)
                curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f)
                verticalLineToRelative(1.49f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(5.02f, -5.02f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(14.0f, 7.59f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _phoneCallback!!
    }

private var _phoneCallback: ImageVector? = null