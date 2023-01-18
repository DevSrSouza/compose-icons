package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DesktopOutline: ImageVector
    get() {
        if (_desktopOutline != null) {
            return _desktopOutline!!
        }
        _desktopOutline = Builder(name = "DesktopOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                lineTo(448.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 480.0f, 96.0f)
                lineTo(480.0f, 352.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 448.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 32.0f, 352.0f)
                lineTo(32.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 448.0f)
                lineToRelative(-8.0f, -64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(-8.0f, 64.0f)
                lineToRelative(96.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(368.0f, 448.0f)
                lineTo(144.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 304.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(448.0f, 384.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(480.0f, 304.0f)
                close()
                moveTo(256.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 368.0f)
                close()
            }
        }
        .build()
        return _desktopOutline!!
    }

private var _desktopOutline: ImageVector? = null
