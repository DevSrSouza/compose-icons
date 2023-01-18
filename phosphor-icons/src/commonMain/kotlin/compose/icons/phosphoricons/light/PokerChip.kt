package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.5f, 199.7f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, -143.4f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.3f, -0.4f, -0.4f)
                reflectiveCurveToRelative(-0.2f, -0.2f, -0.4f, -0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, -143.4f, 0.0f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-0.4f, 0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, 143.4f)
                lineToRelative(0.4f, 0.4f)
                curveToRelative(0.1f, 0.2f, 0.2f, 0.2f, 0.4f, 0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 143.4f, 0.0f)
                curveToRelative(0.2f, -0.2f, 0.3f, -0.2f, 0.4f, -0.4f)
                reflectiveCurveTo(200.3f, 199.9f, 200.5f, 199.7f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(66.3f, 134.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 13.8f, 33.4f)
                lineTo(60.3f, 187.2f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(60.3f, 68.8f)
                lineTo(80.1f, 88.6f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 66.3f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 60.3f, 68.8f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(189.7f, 122.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, -13.8f, -33.4f)
                lineToRelative(19.8f, -19.8f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(128.0f, 178.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 50.0f, -50.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 128.0f, 178.0f)
                close()
                moveTo(167.4f, 80.1f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 134.0f, 66.3f)
                lineTo(134.0f, 38.2f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, true, 53.2f, 22.1f)
                close()
                moveTo(122.0f, 66.3f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 88.6f, 80.1f)
                lineTo(68.8f, 60.3f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(88.6f, 175.9f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 122.0f, 189.7f)
                verticalLineToRelative(28.1f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, true, -53.2f, -22.1f)
                close()
                moveTo(134.0f, 189.7f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 33.4f, -13.8f)
                lineToRelative(19.8f, 19.8f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 134.0f, 217.8f)
                close()
                moveTo(175.9f, 167.4f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 189.7f, 134.0f)
                horizontalLineToRelative(28.1f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, true, -22.1f, 53.2f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
