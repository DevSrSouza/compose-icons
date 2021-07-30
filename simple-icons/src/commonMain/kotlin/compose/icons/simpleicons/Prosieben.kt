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

public val SimpleIcons.Prosieben: ImageVector
    get() {
        if (_prosieben != null) {
            return _prosieben!!
        }
        _prosieben = Builder(name = "Prosieben", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.24f, 0.0f)
                horizontalLineTo(23.68f)
                verticalLineTo(6.64f)
                horizontalLineTo(0.24f)
                moveTo(23.76f, 7.92f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.24f)
                reflectiveCurveToRelative(2.88f, -7.84f, 10.48f, -12.48f)
                curveToRelative(7.12f, -4.4f, 13.04f, -3.6f, 13.04f, -3.6f)
                close()
            }
        }
        .build()
        return _prosieben!!
    }

private var _prosieben: ImageVector? = null
