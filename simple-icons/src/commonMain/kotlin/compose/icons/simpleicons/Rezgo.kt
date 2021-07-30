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

public val SimpleIcons.Rezgo: ImageVector
    get() {
        if (_rezgo != null) {
            return _rezgo!!
        }
        _rezgo = Builder(name = "Rezgo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.147f, 16.705f)
                curveToRelative(-0.015f, -3.076f, 0.004f, -6.175f, -0.024f, -9.238f)
                curveToRelative(0.0f, -2.052f, 0.836f, -3.917f, 2.193f, -5.274f)
                arcTo(7.438f, 7.438f, 0.0f, false, true, 17.59f, 0.0f)
                curveToRelative(1.482f, 0.015f, 2.999f, 0.008f, 4.493f, 0.008f)
                verticalLineToRelative(3.728f)
                curveToRelative(-1.494f, 0.0f, -3.012f, -0.005f, -4.493f, 0.006f)
                arcToRelative(3.713f, 3.713f, 0.0f, false, false, -3.725f, 3.725f)
                curveToRelative(-0.01f, 3.063f, 0.004f, 6.162f, 0.01f, 9.238f)
                close()
                moveTo(4.747f, 16.072f)
                lineToRelative(-3.61f, 0.965f)
                curveToRelative(0.845f, 3.15f, 3.287f, 5.236f, 6.274f, 6.253f)
                arcToRelative(13.74f, 13.74f, 0.0f, false, false, 4.026f, 0.704f)
                curveToRelative(1.385f, 0.039f, 2.78f, -0.117f, 4.092f, -0.469f)
                curveToRelative(3.31f, -0.886f, 6.186f, -3.0f, 7.334f, -6.371f)
                lineToRelative(-3.538f, -1.199f)
                curveToRelative(-0.699f, 2.053f, -2.574f, 3.374f, -4.76f, 3.96f)
                curveToRelative(-0.982f, 0.263f, -2.013f, 0.38f, -3.025f, 0.352f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.93f, -0.514f)
                curveToRelative(-1.868f, -0.636f, -3.378f, -1.87f, -3.862f, -3.681f)
                close()
                moveTo(6.986f, 3.354f)
                arcToRelative(2.887f, 2.887f, 0.0f, true, true, -5.775f, 0.0f)
                arcToRelative(2.887f, 2.887f, 0.0f, false, true, 5.775f, 0.0f)
                close()
            }
        }
        .build()
        return _rezgo!!
    }

private var _rezgo: ImageVector? = null
