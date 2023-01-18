package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SailboatFill: ImageVector
    get() {
        if (_sailboatFill != null) {
            return _sailboatFill!!
        }
        _sailboatFill = Builder(name = "SailboatFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, 0.8f)
                lineToRelative(-2.1f, 2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, 0.4f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -0.4f)
                lineToRelative(-2.1f, -2.8f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 18.0f)
                close()
                moveTo(15.0f, 2.425f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.04f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.39f, -0.812f)
                lineTo(14.11f, 2.113f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.89f, 0.312f)
                close()
            }
        }
        .build()
        return _sailboatFill!!
    }

private var _sailboatFill: ImageVector? = null
