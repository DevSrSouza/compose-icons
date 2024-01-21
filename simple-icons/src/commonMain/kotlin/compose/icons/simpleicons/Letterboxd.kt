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

public val SimpleIcons.Letterboxd: ImageVector
    get() {
        if (_letterboxd != null) {
            return _letterboxd!!
        }
        _letterboxd = Builder(name = "Letterboxd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.224f, 14.352f)
                arcToRelative(4.447f, 4.447f, 0.0f, false, true, -3.775f, 2.092f)
                curveTo(1.992f, 16.444f, 0.0f, 14.454f, 0.0f, 12.0f)
                reflectiveCurveToRelative(1.992f, -4.444f, 4.45f, -4.444f)
                curveToRelative(1.592f, 0.0f, 2.988f, 0.836f, 3.774f, 2.092f)
                curveToRelative(-0.427f, 0.682f, -0.673f, 1.488f, -0.673f, 2.352f)
                reflectiveCurveToRelative(0.246f, 1.67f, 0.673f, 2.352f)
                close()
                moveTo(15.101f, 12.0f)
                curveToRelative(0.0f, -0.864f, 0.247f, -1.67f, 0.674f, -2.352f)
                curveToRelative(-0.786f, -1.256f, -2.183f, -2.092f, -3.775f, -2.092f)
                reflectiveCurveToRelative(-2.989f, 0.836f, -3.775f, 2.092f)
                curveToRelative(0.427f, 0.682f, 0.674f, 1.488f, 0.674f, 2.352f)
                reflectiveCurveToRelative(-0.247f, 1.67f, -0.674f, 2.352f)
                curveToRelative(0.786f, 1.256f, 2.183f, 2.092f, 3.775f, 2.092f)
                reflectiveCurveToRelative(2.989f, -0.836f, 3.775f, -2.092f)
                arcTo(4.42f, 4.42f, 0.0f, false, true, 15.1f, 12.0f)
                close()
                moveTo(19.551f, 7.556f)
                arcToRelative(4.447f, 4.447f, 0.0f, false, false, -3.775f, 2.092f)
                curveToRelative(0.427f, 0.682f, 0.673f, 1.488f, 0.673f, 2.352f)
                reflectiveCurveToRelative(-0.246f, 1.67f, -0.673f, 2.352f)
                arcToRelative(4.447f, 4.447f, 0.0f, false, false, 3.775f, 2.092f)
                curveTo(22.008f, 16.444f, 24.0f, 14.454f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-1.992f, -4.444f, -4.45f, -4.444f)
                close()
            }
        }
        .build()
        return _letterboxd!!
    }

private var _letterboxd: ImageVector? = null
