package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PanToolAlt: ImageVector
    get() {
        if (_panToolAlt != null) {
            return _panToolAlt!!
        }
        _panToolAlt = Builder(name = "PanToolAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.18f, 13.4f)
                lineTo(19.1f, 21.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(5.0f, 15.62f)
                lineToRelative(1.22f, -1.23f)
                lineTo(10.0f, 15.24f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 3.67f, 10.67f, 3.0f, 11.5f, 3.0f)
                reflectiveCurveTo(13.0f, 3.67f, 13.0f, 4.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.38f)
                lineTo(20.18f, 13.4f)
                close()
            }
        }
        .build()
        return _panToolAlt!!
    }

private var _panToolAlt: ImageVector? = null
