package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.HelpCenter: ImageVector
    get() {
        if (_helpCenter != null) {
            return _helpCenter!!
        }
        _helpCenter = Builder(name = "HelpCenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(12.01f, 18.0f)
                curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f)
                curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f)
                curveToRelative(0.71f, 0.0f, 1.25f, 0.54f, 1.25f, 1.25f)
                curveTo(13.25f, 17.43f, 12.72f, 18.0f, 12.01f, 18.0f)
                close()
                moveTo(15.02f, 10.6f)
                curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f)
                curveToRelative(-0.16f, 0.29f, -0.22f, 0.48f, -0.22f, 1.41f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(0.0f, -0.49f, -0.08f, -1.29f, 0.31f, -1.98f)
                curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f)
                curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f)
                curveToRelative(-1.06f, 0.0f, -1.58f, 0.8f, -1.8f, 1.48f)
                lineTo(8.56f, 8.49f)
                curveTo(9.01f, 7.15f, 10.22f, 6.0f, 11.99f, 6.0f)
                curveToRelative(1.48f, 0.0f, 2.49f, 0.67f, 3.01f, 1.52f)
                curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f)
                close()
            }
        }
        .build()
        return _helpCenter!!
    }

private var _helpCenter: ImageVector? = null
