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

public val IonIcons.PhonePortrait: ImageVector
    get() {
        if (_phonePortrait != null) {
            return _phonePortrait!!
        }
        _phonePortrait = Builder(name = "PhonePortrait", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 0.0f)
                lineTo(176.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(112.0f, 448.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(336.0f, 512.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(400.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 336.0f, 0.0f)
                close()
                moveTo(368.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(176.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(144.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(11.35f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 7.3f, 4.75f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 224.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 29.35f, -19.25f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 7.3f, -4.75f)
                lineTo(336.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -9.53f, 4.69f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 288.0f, 72.0f)
                horizontalLineTo(224.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -38.47f, -19.31f)
                arcTo(11.88f, 11.88f, 0.0f, false, false, 176.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 336.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 0.0f)
                lineTo(176.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(112.0f, 448.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(336.0f, 512.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(400.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 336.0f, 0.0f)
                close()
                moveTo(368.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(176.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(144.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(11.35f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 7.3f, 4.75f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 224.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 29.35f, -19.25f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 7.3f, -4.75f)
                lineTo(336.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _phonePortrait!!
    }

private var _phonePortrait: ImageVector? = null
