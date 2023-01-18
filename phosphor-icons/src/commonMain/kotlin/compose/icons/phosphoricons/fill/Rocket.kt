package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 224.0f)
                close()
                moveTo(223.0f, 157.6f)
                lineTo(210.6f, 213.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -10.3f, 11.6f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -5.4f, 0.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.9f, -3.5f)
                lineTo(157.2f, 200.0f)
                lineTo(98.8f, 200.0f)
                lineTo(71.0f, 222.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.9f, 3.5f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -5.4f, -0.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -10.3f, -11.6f)
                lineTo(33.0f, 157.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 3.4f, -13.7f)
                lineTo(66.0f, 108.3f)
                arcToRelative(121.5f, 121.5f, 0.0f, false, true, 8.1f, -35.7f)
                curveToRelative(11.7f, -30.2f, 32.5f, -50.0f, 43.9f, -59.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 20.0f, 0.1f)
                curveToRelative(11.3f, 9.1f, 31.8f, 28.9f, 43.4f, 59.1f)
                arcToRelative(125.4f, 125.4f, 0.0f, false, true, 8.0f, 34.9f)
                lineToRelative(30.2f, 36.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 223.0f, 157.6f)
                close()
                moveTo(85.7f, 190.0f)
                quadToRelative(-15.6f, -29.4f, -19.1f, -57.4f)
                lineTo(48.7f, 154.1f)
                lineTo(61.0f, 209.7f)
                close()
                moveTo(140.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 96.0f)
                close()
                moveTo(207.3f, 154.1f)
                lineTo(189.0f, 132.1f)
                curveToRelative(-2.2f, 18.8f, -8.4f, 38.1f, -18.8f, 57.8f)
                lineTo(195.0f, 209.7f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
