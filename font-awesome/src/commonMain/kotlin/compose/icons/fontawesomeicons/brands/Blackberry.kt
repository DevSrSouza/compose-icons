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

public val BrandsGroup.Blackberry: ImageVector
    get() {
        if (_blackberry != null) {
            return _blackberry!!
        }
        _blackberry = Builder(name = "Blackberry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 116.9f)
                curveToRelative(0.0f, 23.4f, -16.4f, 49.1f, -72.5f, 49.1f)
                lineTo(23.4f, 166.0f)
                lineToRelative(21.0f, -88.8f)
                horizontalLineToRelative(67.8f)
                curveToRelative(42.1f, 0.0f, 53.8f, 23.3f, 53.8f, 39.7f)
                close()
                moveTo(292.2f, 77.2f)
                horizontalLineToRelative(-67.8f)
                lineTo(205.7f, 166.0f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0.0f, 70.1f, -25.7f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.4f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(88.8f, 208.1f)
                lineTo(21.0f, 208.1f)
                lineTo(0.0f, 296.9f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0.0f, 72.5f, -23.4f, 72.5f, -49.1f)
                curveToRelative(0.0f, -16.3f, -11.7f, -39.7f, -53.8f, -39.7f)
                close()
                moveTo(268.9f, 208.1f)
                horizontalLineToRelative(-67.8f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0.0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0.0f, -16.3f, -11.7f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(458.2f, 154.3f)
                horizontalLineToRelative(-67.8f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0.0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(430.2f, 292.2f)
                horizontalLineToRelative(-67.8f)
                lineTo(343.7f, 381.0f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0.0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0.0f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(240.8f, 346.0f)
                lineTo(173.0f, 346.0f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0.0f, 70.1f, -25.7f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
            }
        }
        .build()
        return _blackberry!!
    }

private var _blackberry: ImageVector? = null
