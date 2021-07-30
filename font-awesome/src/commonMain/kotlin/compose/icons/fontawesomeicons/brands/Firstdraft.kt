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

public val BrandsGroup.Firstdraft: ImageVector
    get() {
        if (_firstdraft != null) {
            return _firstdraft!!
        }
        _firstdraft = Builder(name = "Firstdraft", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(128.0f)
                lineTo(192.0f, 320.0f)
                verticalLineToRelative(128.0f)
                lineTo(0.0f, 448.0f)
                verticalLineToRelative(-25.6f)
                horizontalLineToRelative(166.4f)
                verticalLineToRelative(-128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-128.0f)
                lineTo(384.0f, 166.4f)
                lineTo(384.0f, 192.0f)
                close()
                moveTo(358.4f, 230.4f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-128.0f)
                verticalLineToRelative(128.0f)
                lineTo(64.0f, 486.4f)
                lineTo(64.0f, 512.0f)
                horizontalLineToRelative(192.0f)
                lineTo(256.0f, 384.0f)
                horizontalLineToRelative(128.0f)
                lineTo(384.0f, 230.4f)
                horizontalLineToRelative(-25.6f)
                close()
                moveTo(384.0f, 422.4f)
                horizontalLineToRelative(-89.6f)
                lineTo(294.4f, 512.0f)
                lineTo(320.0f, 512.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-25.6f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(384.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 256.0f)
                horizontalLineToRelative(128.0f)
                lineTo(256.0f, 128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(384.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _firstdraft!!
    }

private var _firstdraft: ImageVector? = null
