package compose.icons.lineaicons.software

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
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.HorizontalDistributeRight: ImageVector
    get() {
        if (_horizontalDistributeRight != null) {
            return _horizontalDistributeRight!!
        }
        _horizontalDistributeRight = Builder(name = "HorizontalDistributeRight", defaultWidth =
                64.0.dp, defaultHeight = 64.0.dp, viewportWidth = 64.0f, viewportHeight =
                64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.0f, 64.0f)
                lineTo(29.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(51.0f, 64.0f)
                lineTo(51.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(35.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-16.0f)
                close()
            }
        }
        .build()
        return _horizontalDistributeRight!!
    }

private var _horizontalDistributeRight: ImageVector? = null
