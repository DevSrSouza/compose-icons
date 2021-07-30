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

public val SimpleIcons.Crunchyroll: ImageVector
    get() {
        if (_crunchyroll != null) {
            return _crunchyroll!!
        }
        _crunchyroll = Builder(name = "Crunchyroll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.933f, 13.467f)
                arcToRelative(10.55f, 10.55f, 0.0f, true, true, 21.067f, -0.8f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(0.8f)
                arcToRelative(10.617f, 10.617f, 0.0f, false, true, -9.867f, -10.533f)
                close()
                moveTo(19.2f, 14.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, -1.333f, -7.467f)
                arcTo(7.89f, 7.89f, 0.0f, false, false, 14.0f, 5.6f)
                arcToRelative(8.4f, 8.4f, 0.0f, true, false, 8.4f, 8.4f)
                arcToRelative(6.492f, 6.492f, 0.0f, false, false, -0.133f, -1.6f)
                arcTo(3.415f, 3.415f, 0.0f, false, true, 19.2f, 14.0f)
                close()
            }
        }
        .build()
        return _crunchyroll!!
    }

private var _crunchyroll: ImageVector? = null
