package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = Builder(name = "Npm", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 288.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(576.0f, 160.0f)
                verticalLineToRelative(192.0f)
                lineTo(288.0f, 352.0f)
                verticalLineToRelative(32.0f)
                lineTo(160.0f, 384.0f)
                verticalLineToRelative(-32.0f)
                lineTo(0.0f, 352.0f)
                lineTo(0.0f, 160.0f)
                horizontalLineToRelative(576.0f)
                close()
                moveTo(160.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                lineTo(160.0f, 192.0f)
                close()
                moveTo(320.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                verticalLineToRelative(160.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(64.0f)
                lineTo(320.0f, 192.0f)
                close()
                moveTo(544.0f, 192.0f)
                lineTo(352.0f, 192.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                lineTo(544.0f, 192.0f)
                close()
            }
        }
        .build()
        return _npm!!
    }

private var _npm: ImageVector? = null
