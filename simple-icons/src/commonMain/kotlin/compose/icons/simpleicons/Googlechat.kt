package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlechat: ImageVector
    get() {
        if (_googlechat != null) {
            return _googlechat!!
        }
        _googlechat = Builder(name = "Googlechat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.533f, 0.0f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, -1.816f, 1.816f)
                verticalLineToRelative(2.832f)
                horizontalLineToRelative(11.178f)
                curveToRelative(1.043f, 0.0f, 1.888f, 0.855f, 1.888f, 1.91f)
                verticalLineToRelative(8.204f)
                horizontalLineToRelative(2.906f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, 1.817f, -1.817f)
                verticalLineTo(1.816f)
                arcTo(1.816f, 1.816f, 0.0f, false, false, 21.689f, 0.0f)
                horizontalLineTo(7.533f)
                close()
                moveTo(2.311f, 5.148f)
                arcTo(1.816f, 1.816f, 0.0f, false, false, 0.494f, 6.965f)
                verticalLineTo(23.09f)
                curveToRelative(0.0f, 0.81f, 0.979f, 1.215f, 1.55f, 0.642f)
                lineToRelative(3.749f, -3.748f)
                horizontalLineToRelative(10.674f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, 1.816f, -1.816f)
                verticalLineTo(6.965f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, false, -1.816f, -1.817f)
                horizontalLineTo(2.31f)
                close()
            }
        }
        .build()
        return _googlechat!!
    }

private var _googlechat: ImageVector? = null
