package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CreativeCommonsBy: ImageVector
    get() {
        if (_creativeCommonsBy != null) {
            return _creativeCommonsBy!!
        }
        _creativeCommonsBy = Builder(name = "CreativeCommonsBy", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8545f, 3.0f, 3.0f, 8.8545f, 3.0f, 16.0f)
                curveTo(3.0f, 23.1455f, 8.8545f, 29.0f, 16.0f, 29.0f)
                curveTo(23.1455f, 29.0f, 29.0f, 23.1455f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8545f, 23.1455f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.0545f, 5.0f, 27.0f, 9.9455f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0545f, 22.0545f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9455f, 27.0f, 5.0f, 22.0545f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9455f, 9.9455f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(14.9f, 8.0f, 14.0f, 8.9f, 14.0f, 10.0f)
                curveTo(14.0f, 11.1f, 14.9f, 12.0f, 16.0f, 12.0f)
                curveTo(17.1f, 12.0f, 18.0f, 11.1f, 18.0f, 10.0f)
                curveTo(18.0f, 8.9f, 17.1f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(14.3f, 13.0f, 13.0f, 14.3f, 13.0f, 16.0f)
                lineTo(13.0f, 19.0f)
                lineTo(14.0f, 20.0f)
                lineTo(14.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 20.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 16.0f)
                curveTo(19.0f, 14.3f, 17.7f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsBy!!
    }

private var _creativeCommonsBy: ImageVector? = null
