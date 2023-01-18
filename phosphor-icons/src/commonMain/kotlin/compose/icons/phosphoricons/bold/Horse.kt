package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.9f, 52.2f)
                arcTo(107.2f, 107.2f, 0.0f, false, false, 128.0f, 20.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(57.3f)
                lineTo(9.7f, 117.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -5.5f, 7.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 6.3f, 135.0f)
                lineToRelative(13.8f, 19.1f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, 35.2f, 14.5f)
                curveToRelative(12.3f, -2.1f, 34.0f, -3.9f, 54.7f, 4.0f)
                lineTo(88.8f, 202.3f)
                arcTo(84.3f, 84.3f, 0.0f, false, true, 72.0f, 190.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.0f, 17.9f)
                arcTo(107.7f, 107.7f, 0.0f, false, false, 128.0f, 236.0f)
                horizontalLineToRelative(2.2f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 204.9f, 52.2f)
                close()
                moveTo(187.5f, 187.1f)
                arcToRelative(83.1f, 83.1f, 0.0f, false, true, -75.1f, 23.4f)
                lineToRelative(22.0f, -30.8f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 188.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -33.0f, 35.9f)
                curveToRelative(-29.6f, -16.2f, -62.4f, -13.9f, -79.7f, -11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, -4.8f)
                lineToRelative(-6.2f, -8.6f)
                lineToRelative(93.0f, -57.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 64.0f)
                verticalLineTo(44.1f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, 55.5f, 143.0f)
                close()
                moveTo(144.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 104.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
