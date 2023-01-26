package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Cameraswitch: ImageVector
    get() {
        if (_cameraswitch != null) {
            return _cameraswitch!!
        }
        _cameraswitch = Builder(name = "Cameraswitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.57f, 0.51f)
                lineToRelative(4.48f, 4.48f)
                verticalLineTo(2.04f)
                curveToRelative(4.72f, 0.47f, 8.48f, 4.23f, 8.95f, 8.95f)
                curveToRelative(0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f)
                curveTo(23.34f, 3.02f, 15.49f, -1.59f, 8.57f, 0.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.95f, 21.96f)
                curveTo(6.23f, 21.49f, 2.47f, 17.73f, 2.0f, 13.01f)
                curveToRelative(0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f)
                curveToRelative(0.66f, 7.97f, 8.51f, 12.58f, 15.43f, 10.48f)
                lineToRelative(-4.48f, -4.48f)
                verticalLineTo(21.96f)
                close()
            }
        }
        .build()
        return _cameraswitch!!
    }

private var _cameraswitch: ImageVector? = null
