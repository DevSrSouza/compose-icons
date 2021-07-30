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

public val SimpleIcons.Openbugbounty: ImageVector
    get() {
        if (_openbugbounty != null) {
            return _openbugbounty!!
        }
        _openbugbounty = Builder(name = "Openbugbounty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.092f, 2.443f)
                arcToRelative(1.388f, 1.388f, 0.0f, false, false, -1.428f, 1.611f)
                curveToRelative(0.42f, 2.567f, 2.11f, 4.115f, 3.58f, 4.998f)
                arcToRelative(14.12f, 14.12f, 0.0f, false, false, 0.4f, 2.926f)
                horizontalLineTo(6.52f)
                arcToRelative(1.388f, 1.388f, 0.0f, false, false, 0.0f, 2.777f)
                horizontalLineToRelative(5.155f)
                curveToRelative(0.39f, 0.767f, 0.85f, 1.475f, 1.37f, 2.108f)
                curveToRelative(-1.816f, 1.36f, -3.516f, 3.734f, -4.34f, 4.983f)
                arcToRelative(1.388f, 1.388f, 0.0f, true, false, 2.316f, 1.531f)
                curveToRelative(1.376f, -2.08f, 3.15f, -4.046f, 4.09f, -4.604f)
                arcToRelative(8.208f, 8.208f, 0.0f, false, false, 3.757f, 1.416f)
                verticalLineTo(6.492f)
                horizontalLineToRelative(-7.484f)
                curveToRelative(-0.867f, -0.588f, -1.753f, -1.506f, -1.979f, -2.886f)
                arcToRelative(1.388f, 1.388f, 0.0f, false, false, -1.313f, -1.163f)
                close()
                moveTo(18.859f, 0.0f)
                curveToRelative(-2.971f, 0.0f, -5.501f, 1.967f, -6.577f, 4.765f)
                horizontalLineToRelative(6.577f)
                close()
            }
        }
        .build()
        return _openbugbounty!!
    }

private var _openbugbounty: ImageVector? = null
