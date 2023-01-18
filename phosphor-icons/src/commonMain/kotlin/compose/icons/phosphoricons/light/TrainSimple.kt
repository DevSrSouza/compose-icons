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

public val LightGroup.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) {
            return _trainSimple!!
        }
        _trainSimple = Builder(name = "TrainSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 26.0f)
                lineTo(68.0f, 26.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 38.0f, 56.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, 30.0f)
                lineTo(84.0f, 214.0f)
                lineTo(67.2f, 236.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.6f, 7.2f)
                lineTo(99.0f, 214.0f)
                horizontalLineToRelative(58.0f)
                lineToRelative(22.2f, 29.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, -7.2f)
                lineTo(172.0f, 214.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, -30.0f)
                lineTo(218.0f, 56.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 188.0f, 26.0f)
                close()
                moveTo(68.0f, 38.0f)
                lineTo(188.0f, 38.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(66.0f)
                lineTo(50.0f, 122.0f)
                lineTo(50.0f, 56.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 68.0f, 38.0f)
                close()
                moveTo(188.0f, 202.0f)
                lineTo(68.0f, 202.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(50.0f, 134.0f)
                lineTo(206.0f, 134.0f)
                verticalLineToRelative(50.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 188.0f, 202.0f)
                close()
                moveTo(94.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 172.0f)
                close()
                moveTo(182.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 172.0f)
                close()
            }
        }
        .build()
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
