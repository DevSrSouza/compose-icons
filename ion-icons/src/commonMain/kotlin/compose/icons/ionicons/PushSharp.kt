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

public val IonIcons.PushSharp: ImageVector
    get() {
        if (_pushSharp != null) {
            return _pushSharp!!
        }
        _pushSharp = Builder(name = "PushSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 352.0f)
                verticalLineTo(204.63f)
                lineToRelative(64.0f, 64.0f)
                lineTo(358.63f, 246.0f)
                lineTo(256.0f, 143.37f)
                lineTo(153.37f, 246.0f)
                lineTo(176.0f, 268.63f)
                lineToRelative(64.0f, -64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 32.0f)
                horizontalLineTo(420.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(340.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 352.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _pushSharp!!
    }

private var _pushSharp: ImageVector? = null
