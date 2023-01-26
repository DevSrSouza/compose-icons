package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(13.2f, 13.74f)
                curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f)
                curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f)
                curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f)
                curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f)
                curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3.0f)
                curveToRelative(0.0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f)
                curveTo(12.2f, 9.61f, 13.0f, 7.0f, 13.0f, 7.0f)
                curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6.0f, 8.0f)
                curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
