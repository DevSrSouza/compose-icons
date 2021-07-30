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

public val SimpleIcons.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.931f, 12.645f)
                horizontalLineToRelative(4.138f)
                lineToRelative(-2.07f, -4.908f)
                moveToRelative(0.0f, -7.737f)
                lineTo(0.68f, 3.982f)
                lineToRelative(1.726f, 14.771f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.596f, -5.242f)
                lineTo(23.32f, 3.984f)
                lineTo(11.999f, 0.001f)
                close()
                moveTo(19.063f, 18.31f)
                horizontalLineToRelative(-2.638f)
                lineToRelative(-1.422f, -3.503f)
                lineTo(8.996f, 14.807f)
                lineToRelative(-1.422f, 3.504f)
                horizontalLineToRelative(-2.64f)
                lineTo(12.0f, 2.65f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
