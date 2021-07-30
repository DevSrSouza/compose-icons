package compose.icons.lineaicons.basicelaboration

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
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.CloudSearch: ImageVector
    get() {
        if (_cloudSearch != null) {
            return _cloudSearch!!
        }
        _cloudSearch = Builder(name = "CloudSearch", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 50.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(4.565f, 0.0f, 8.0f, -3.582f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.435f, -8.0f, -8.0f, -8.0f)
                curveToRelative(0.0f, -11.046f, -9.52f, -20.0f, -20.934f, -20.0f)
                curveTo(23.966f, 14.0f, 14.8f, 20.732f, 13.0f, 30.0f)
                curveToRelative(0.0f, 0.0f, -0.831f, 0.0f, -1.667f, 0.0f)
                curveTo(5.626f, 30.0f, 1.0f, 34.477f, 1.0f, 40.0f)
                reflectiveCurveToRelative(4.293f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(41.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.0f, 31.0f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 35.0f)
                lineTo(41.0f, 43.0f)
            }
        }
        .build()
        return _cloudSearch!!
    }

private var _cloudSearch: ImageVector? = null
