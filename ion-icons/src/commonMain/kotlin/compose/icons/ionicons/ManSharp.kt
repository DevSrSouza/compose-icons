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

public val IonIcons.ManSharp: ImageVector
    get() {
        if (_manSharp != null) {
            return _manSharp!!
        }
        _manSharp = Builder(name = "ManSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 128.0f)
                horizontalLineTo(176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(328.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(160.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 336.0f, 128.0f)
                close()
            }
        }
        .build()
        return _manSharp!!
    }

private var _manSharp: ImageVector? = null
