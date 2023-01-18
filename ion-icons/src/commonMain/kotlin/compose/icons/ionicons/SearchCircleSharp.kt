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

public val IonIcons.SearchCircleSharp: ImageVector
    get() {
        if (_searchCircleSharp != null) {
            return _searchCircleSharp!!
        }
        _searchCircleSharp = Builder(name = "SearchCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(150.13f, 64.0f, 64.0f, 150.13f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.13f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.13f, 192.0f, -192.0f)
                reflectiveCurveTo(361.87f, 64.0f, 256.0f, 64.0f)
                close()
                moveTo(336.0f, 358.63f)
                lineTo(281.85f, 304.48f)
                arcToRelative(88.08f, 88.08f, 0.0f, true, true, 22.63f, -22.63f)
                lineTo(358.63f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 232.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
        }
        .build()
        return _searchCircleSharp!!
    }

private var _searchCircleSharp: ImageVector? = null
