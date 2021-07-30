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

public val BasicElaborationGroup.BriefcaseUpload: ImageVector
    get() {
        if (_briefcaseUpload != null) {
            return _briefcaseUpload!!
        }
        _briefcaseUpload = Builder(name = "BriefcaseUpload", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 41.0f)
                lineToRelative(6.0f, -40.0f)
                lineToRelative(42.0f, 0.0f)
                lineToRelative(6.0f, 40.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 41.0f)
                curveToRelative(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.925f, 11.0f, -11.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(41.0f)
                horizontalLineTo(21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.998f, 22.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(8.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.998f, 14.0f)
                lineTo(31.998f, 34.0f)
            }
        }
        .build()
        return _briefcaseUpload!!
    }

private var _briefcaseUpload: ImageVector? = null
