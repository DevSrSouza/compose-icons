package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.WifiSharp: ImageVector
    get() {
        if (_wifiSharp != null) {
            return _wifiSharp!!
        }
        _wifiSharp = Builder(name = "WifiSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 42.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(332.69f, 320.0f)
                arcToRelative(115.0f, 115.0f, 0.0f, false, false, -152.8f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 42.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(393.74f, 259.0f)
                arcToRelative(201.26f, 201.26f, 0.0f, false, false, -274.92f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 42.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 191.52f)
                arcToRelative(288.0f, 288.0f, 0.0f, false, false, -383.44f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.67f, 384.0f)
                lineTo(256.0f, 433.0f)
                lineToRelative(-44.34f, -49.0f)
                arcToRelative(56.73f, 56.73f, 0.0f, false, true, 88.92f, 0.0f)
                close()
            }
        }
        .build()
        return _wifiSharp!!
    }

private var _wifiSharp: ImageVector? = null
