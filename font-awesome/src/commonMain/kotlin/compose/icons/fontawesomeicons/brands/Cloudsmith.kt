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

public val BrandsGroup.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 227.6f)
                verticalLineToRelative(56.9f)
                lineTo(284.4f, 512.0f)
                lineTo(227.6f, 512.0f)
                lineTo(0.0f, 284.4f)
                lineTo(0.0f, 227.6f)
                lineTo(227.6f, 0.0f)
                horizontalLineToRelative(56.9f)
                lineTo(512.0f, 227.6f)
                close()
                moveTo(256.0f, 389.6f)
                arcToRelative(133.6f, 133.6f, 0.0f, true, false, 0.0f, -267.1f)
                arcToRelative(133.6f, 133.6f, 0.0f, true, false, 0.0f, 267.1f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
