package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RibbonOutline: ImageVector
    get() {
        if (_ribbonOutline != null) {
            return _ribbonOutline!!
        }
        _ribbonOutline = Builder(name = "RibbonOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                moveToRelative(-128.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(143.65f, 227.82f)
                lineTo(48.0f, 400.0f)
                lineToRelative(86.86f, -0.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.82f, 7.8f)
                lineTo(192.0f, 480.0f)
                lineToRelative(88.33f, -194.32f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(366.54f, 224.0f)
                lineTo(464.0f, 400.0f)
                lineToRelative(-86.86f, -0.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.82f, 7.8f)
                lineTo(320.0f, 480.0f)
                lineTo(256.0f, 339.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                moveToRelative(-64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
            }
        }
        .build()
        return _ribbonOutline!!
    }

private var _ribbonOutline: ImageVector? = null
