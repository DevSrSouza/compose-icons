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

public val SimpleIcons.Cirrusci: ImageVector
    get() {
        if (_cirrusci != null) {
            return _cirrusci!!
        }
        _cirrusci = Builder(name = "Cirrusci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.422f, 0.453f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, -1.113f, 1.115f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 1.112f, 1.114f)
                curveToRelative(1.31f, 0.0f, 2.35f, 1.042f, 2.35f, 2.363f)
                curveToRelative(0.0f, 1.32f, -1.04f, 2.363f, -2.35f, 2.363f)
                horizontalLineTo(1.112f)
                arcTo(1.113f, 1.113f, 0.0f, false, false, 0.0f, 8.52f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 1.113f, 1.117f)
                horizontalLineToRelative(18.31f)
                curveToRelative(1.308f, 0.0f, 2.35f, 1.042f, 2.35f, 2.363f)
                curveToRelative(0.0f, 1.32f, -1.042f, 2.363f, -2.35f, 2.363f)
                horizontalLineTo(1.112f)
                arcTo(1.113f, 1.113f, 0.0f, false, false, 0.0f, 15.48f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 1.113f, 1.112f)
                horizontalLineToRelative(18.31f)
                curveToRelative(1.308f, 0.0f, 2.35f, 1.042f, 2.35f, 2.363f)
                curveToRelative(0.0f, 1.32f, -1.042f, 2.363f, -2.35f, 2.363f)
                horizontalLineTo(1.112f)
                arcTo(1.113f, 1.113f, 0.0f, false, false, 0.0f, 22.432f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 1.113f, 1.115f)
                horizontalLineToRelative(18.31f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.206f, -0.022f)
                curveToRelative(2.42f, -0.112f, 4.37f, -2.12f, 4.37f, -4.57f)
                curveToRelative(0.0f, -1.393f, -0.642f, -2.634f, -1.63f, -3.478f)
                curveTo(23.356f, 14.632f, 24.0f, 13.393f, 24.0f, 12.0f)
                curveToRelative(0.0f, -1.393f, -0.643f, -2.632f, -1.63f, -3.477f)
                curveTo(23.357f, 7.68f, 24.0f, 6.438f, 24.0f, 5.045f)
                curveToRelative(0.0f, -2.52f, -2.06f, -4.592f, -4.578f, -4.592f)
                close()
            }
        }
        .build()
        return _cirrusci!!
    }

private var _cirrusci: ImageVector? = null
