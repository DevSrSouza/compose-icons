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

public val SolidGroup.ICursor: ImageVector
    get() {
        if (_iCursor != null) {
            return _iCursor!!
        }
        _iCursor = Builder(name = "ICursor", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 52.05f)
                verticalLineTo(12.06f)
                curveTo(256.0f, 5.5f, 250.73f, 0.15f, 244.16f, 0.07f)
                curveTo(211.62f, -0.34f, 166.47f, 0.01f, 128.0f, 37.96f)
                curveTo(90.27f, 0.74f, 46.98f, -0.11f, 11.91f, 0.11f)
                curveTo(5.32f, 0.16f, 0.0f, 5.52f, 0.0f, 12.11f)
                verticalLineToRelative(39.65f)
                curveToRelative(0.0f, 6.69f, 5.46f, 12.08f, 12.15f, 12.0f)
                curveTo(38.11f, 63.45f, 96.0f, 67.24f, 96.0f, 112.18f)
                verticalLineTo(224.0f)
                horizontalLineTo(60.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 44.93f, -56.08f, 48.03f, -83.95f, 47.96f)
                curveTo(5.4f, 447.94f, 0.0f, 453.31f, 0.0f, 459.95f)
                verticalLineToRelative(39.98f)
                curveToRelative(0.0f, 6.57f, 5.27f, 11.92f, 11.84f, 12.0f)
                curveToRelative(32.54f, 0.41f, 77.69f, 0.05f, 116.16f, -37.89f)
                curveToRelative(37.73f, 37.22f, 81.02f, 38.07f, 116.09f, 37.85f)
                curveToRelative(6.59f, -0.04f, 11.91f, -5.41f, 11.91f, -12.0f)
                verticalLineTo(460.24f)
                curveToRelative(0.0f, -6.69f, -5.46f, -12.08f, -12.15f, -12.0f)
                curveTo(217.89f, 448.55f, 160.0f, 444.94f, 160.0f, 400.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineTo(112.18f)
                curveToRelative(0.0f, -44.93f, 56.08f, -48.21f, 83.95f, -48.14f)
                curveToRelative(6.65f, 0.02f, 12.05f, -5.35f, 12.05f, -11.99f)
                close()
            }
        }
        .build()
        return _iCursor!!
    }

private var _iCursor: ImageVector? = null
