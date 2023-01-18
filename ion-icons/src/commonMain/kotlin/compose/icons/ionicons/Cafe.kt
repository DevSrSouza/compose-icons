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

public val IonIcons.Cafe: ImageVector
    get() {
        if (_cafe != null) {
            return _cafe!!
        }
        _cafe = Builder(name = "Cafe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 80.0f)
                lineTo(80.0f, 272.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, 96.0f, 96.0f)
                lineTo(288.0f, 368.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, 96.0f, -96.0f)
                lineTo(384.0f, 192.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(464.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 432.0f, 64.0f)
                close()
                moveTo(432.0f, 130.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(384.0f, 160.0f)
                lineTo(384.0f, 96.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 400.0f)
                horizontalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _cafe!!
    }

private var _cafe: ImageVector? = null
