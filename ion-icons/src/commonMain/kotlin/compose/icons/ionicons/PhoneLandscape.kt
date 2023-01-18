package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PhoneLandscape: ImageVector
    get() {
        if (_phoneLandscape != null) {
            return _phoneLandscape!!
        }
        _phoneLandscape = Builder(name = "PhoneLandscape", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 176.0f)
                lineTo(0.0f, 336.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(448.0f, 400.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(512.0f, 176.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, -64.0f)
                lineTo(64.0f, 112.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 176.0f)
                close()
                moveTo(448.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(480.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(64.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(32.0f, 324.65f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 4.75f, -7.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 56.0f, 288.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -19.25f, -29.35f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -4.75f, -7.3f)
                lineTo(32.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 176.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 4.69f, 9.53f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 72.0f, 224.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -19.31f, 38.47f)
                arcTo(11.88f, 11.88f, 0.0f, false, false, 48.0f, 336.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 176.0f)
                lineTo(0.0f, 336.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(448.0f, 400.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(512.0f, 176.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, -64.0f)
                lineTo(64.0f, 112.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 176.0f)
                close()
                moveTo(448.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(480.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(64.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(32.0f, 324.65f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 4.75f, -7.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 56.0f, 288.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -19.25f, -29.35f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -4.75f, -7.3f)
                lineTo(32.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _phoneLandscape!!
    }

private var _phoneLandscape: ImageVector? = null
