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

public val BrandsGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(420.55f, 301.93f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                moveToRelative(-265.1f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                moveToRelative(273.7f, -144.48f)
                lineToRelative(47.94f, -83.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.27f, -10.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-48.54f, 84.07f)
                arcToRelative(301.25f, 301.25f, 0.0f, false, false, -246.56f, 0.0f)
                lineTo(116.18f, 64.45f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.27f, 10.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(47.94f, 83.0f)
                curveTo(64.53f, 202.22f, 8.24f, 285.55f, 0.0f, 384.0f)
                horizontalLineTo(576.0f)
                curveToRelative(-8.24f, -98.45f, -64.54f, -181.78f, -146.85f, -226.55f)
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
