package compose.icons.lineaicons.basicelaboration

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.CloudRefresh: ImageVector
    get() {
        if (_cloudRefresh != null) {
            return _cloudRefresh!!
        }
        _cloudRefresh = Builder(name = "CloudRefresh", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 32.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 9.0f, 8.0f, 9.0f)
                horizontalLineToRelative(4.0f)
            }
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
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 45.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(-3.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.0f, 32.0f)
                curveToRelative(0.0f, -4.418f, -3.582f, -9.0f, -8.0f, -9.0f)
                horizontalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 19.0f)
                lineToRelative(-3.0f, 4.0f)
                lineToRelative(3.0f, 4.0f)
            }
        }
        .build()
        return _cloudRefresh!!
    }

private var _cloudRefresh: ImageVector? = null
