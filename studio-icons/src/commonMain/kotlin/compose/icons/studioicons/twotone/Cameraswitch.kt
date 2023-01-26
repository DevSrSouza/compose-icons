package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Cameraswitch: ImageVector
    get() {
        if (_cameraswitch != null) {
            return _cameraswitch!!
        }
        _cameraswitch = Builder(name = "Cameraswitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.17f, 8.0f)
                horizontalLineToRelative(-2.34f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.83f)
                lineTo(13.17f, 8.0f)
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
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.9f, 17.1f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.83f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(2.34f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.57f, 0.52f)
                lineTo(13.05f, 5.0f)
                verticalLineTo(2.05f)
                curveTo(17.77f, 2.52f, 21.53f, 6.28f, 22.0f, 11.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f)
                curveTo(23.34f, 3.03f, 15.49f, -1.58f, 8.57f, 0.52f)
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
