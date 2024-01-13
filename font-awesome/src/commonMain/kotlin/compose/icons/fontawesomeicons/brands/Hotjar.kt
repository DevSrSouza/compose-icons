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

public val BrandsGroup.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(361.5f, 0.0f)
                curveToRelative(0.0f, 131.6f, -80.7f, 176.8f, -140.2f, 209.4f)
                curveToRelative(-0.6f, 0.3f, -1.1f, 0.6f, -1.6f, 0.9f)
                curveToRelative(-53.8f, 30.2f, -88.7f, 49.8f, -89.6f, 122.0f)
                horizontalLineTo(32.0f)
                curveTo(32.0f, 200.8f, 112.7f, 155.6f, 172.2f, 123.0f)
                curveTo(227.0f, 93.2f, 262.5f, 73.0f, 262.5f, 0.0f)
                horizontalLineToRelative(98.9f)
                close()
                moveTo(301.0f, 302.6f)
                curveToRelative(54.8f, -29.8f, 90.3f, -50.0f, 90.3f, -123.0f)
                horizontalLineToRelative(98.0f)
                curveToRelative(0.0f, 131.6f, -80.7f, 176.7f, -140.2f, 209.4f)
                curveToRelative(-54.8f, 29.8f, -90.3f, 50.0f, -90.3f, 123.0f)
                horizontalLineToRelative(-98.0f)
                curveToRelative(0.0f, -131.6f, 80.7f, -176.8f, 140.2f, -209.4f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
