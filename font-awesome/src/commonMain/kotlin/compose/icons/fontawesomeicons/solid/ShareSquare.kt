package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(568.48f, 177.45f)
                lineTo(424.48f, 313.43f)
                curveTo(409.3f, 327.77f, 384.0f, 317.14f, 384.0f, 295.98f)
                verticalLineToRelative(-71.96f)
                curveToRelative(-144.57f, 0.97f, -205.57f, 35.11f, -164.77f, 171.35f)
                curveToRelative(4.48f, 14.97f, -12.85f, 26.57f, -25.01f, 17.33f)
                curveTo(155.25f, 383.11f, 120.0f, 326.49f, 120.0f, 269.34f)
                curveToRelative(0.0f, -143.94f, 117.6f, -172.5f, 264.0f, -173.31f)
                verticalLineTo(24.01f)
                curveToRelative(0.0f, -21.17f, 25.32f, -31.77f, 40.48f, -17.45f)
                lineToRelative(144.0f, 135.99f)
                curveToRelative(10.02f, 9.46f, 10.03f, 25.42f, 0.0f, 34.9f)
                close()
                moveTo(384.0f, 379.13f)
                verticalLineTo(448.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(50.92f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, false, 8.65f, -3.69f)
                curveToRelative(14.95f, -15.57f, 32.24f, -27.89f, 51.01f, -37.68f)
                curveTo(185.71f, 80.83f, 181.58f, 64.0f, 169.03f, 64.0f)
                horizontalLineTo(48.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-88.81f)
                curveToRelative(0.0f, -8.29f, -8.2f, -14.07f, -16.01f, -11.3f)
                arcToRelative(71.83f, 71.83f, 0.0f, false, true, -34.19f, 3.38f)
                curveToRelative(-7.27f, -1.05f, -13.8f, 4.51f, -13.8f, 11.86f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
