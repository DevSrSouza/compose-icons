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

public val SimpleIcons.Qwant: ImageVector
    get() {
        if (_qwant != null) {
            return _qwant!!
        }
        _qwant = Builder(name = "Qwant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.39f, 0.0f)
                curveToRelative(5.322f, 0.0f, 9.652f, 4.46f, 9.652f, 9.944f)
                curveToRelative(0.0f, 5.358f, -4.132f, 9.738f, -9.285f, 9.938f)
                lineToRelative(-0.235f, 0.006f)
                horizontalLineToRelative(9.488f)
                lineTo(22.262f, 24.0f)
                horizontalLineToRelative(-9.62f)
                lineToRelative(-1.253f, -4.11f)
                curveToRelative(-5.321f, -0.001f, -9.65f, -4.462f, -9.65f, -9.946f)
                reflectiveCurveTo(6.067f, 0.0f, 11.388f, 0.0f)
                close()
                moveTo(11.39f, 3.364f)
                curveToRelative(-3.522f, 0.0f, -6.387f, 2.952f, -6.387f, 6.58f)
                curveToRelative(0.0f, 3.63f, 2.865f, 6.58f, 6.387f, 6.58f)
                curveToRelative(3.522f, 0.0f, 6.387f, -2.95f, 6.387f, -6.58f)
                curveToRelative(0.0f, -3.628f, -2.865f, -6.58f, -6.387f, -6.58f)
                close()
            }
        }
        .build()
        return _qwant!!
    }

private var _qwant: ImageVector? = null
