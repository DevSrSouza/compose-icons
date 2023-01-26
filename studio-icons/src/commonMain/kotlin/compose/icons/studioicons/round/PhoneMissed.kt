package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhoneMissed: ImageVector
    get() {
        if (_phoneMissed != null) {
            return _phoneMissed!!
        }
        _phoneMissed = Builder(name = "PhoneMissed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.09f, 16.2f)
                curveToRelative(-6.33f, -5.59f, -15.86f, -5.59f, -22.18f, 0.0f)
                curveToRelative(-0.84f, 0.74f, -0.84f, 2.05f, -0.05f, 2.84f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(0.71f, 0.71f, 1.84f, 0.77f, 2.62f, 0.15f)
                lineToRelative(1.97f, -1.57f)
                curveToRelative(0.47f, -0.37f, 0.75f, -0.94f, 0.75f, -1.55f)
                verticalLineTo(14.7f)
                curveToRelative(2.98f, -0.97f, 6.21f, -0.98f, 9.2f, 0.0f)
                verticalLineToRelative(2.58f)
                curveToRelative(0.0f, 0.6f, 0.28f, 1.17f, 0.75f, 1.55f)
                lineToRelative(1.96f, 1.56f)
                curveToRelative(0.79f, 0.62f, 1.91f, 0.56f, 2.62f, -0.15f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(0.8f, -0.79f, 0.79f, -2.1f, -0.04f, -2.84f)
                close()
                moveTo(6.0f, 9.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(6.43f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(5.66f, -5.66f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-4.95f, 4.95f)
                lineTo(8.4f, 5.0f)
                horizontalLineTo(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _phoneMissed!!
    }

private var _phoneMissed: ImageVector? = null
