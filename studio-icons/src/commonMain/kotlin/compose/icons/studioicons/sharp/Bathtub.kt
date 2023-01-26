package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Bathtub: ImageVector
    get() {
        if (_bathtub != null) {
            return _bathtub!!
        }
        _bathtub = Builder(name = "Bathtub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                verticalLineTo(4.83f)
                curveTo(20.0f, 3.27f, 18.73f, 2.0f, 17.17f, 2.0f)
                curveToRelative(-0.75f, 0.0f, -1.47f, 0.3f, -2.0f, 0.83f)
                lineToRelative(-1.25f, 1.25f)
                curveTo(13.76f, 4.03f, 13.59f, 4.0f, 13.41f, 4.0f)
                curveToRelative(-0.4f, 0.0f, -0.77f, 0.12f, -1.08f, 0.32f)
                lineToRelative(2.76f, 2.76f)
                curveToRelative(0.2f, -0.31f, 0.32f, -0.68f, 0.32f, -1.08f)
                curveToRelative(0.0f, -0.18f, -0.03f, -0.34f, -0.07f, -0.51f)
                lineToRelative(1.25f, -1.25f)
                curveTo(16.74f, 4.09f, 16.95f, 4.0f, 17.17f, 4.0f)
                curveTo(17.63f, 4.0f, 18.0f, 4.37f, 18.0f, 4.83f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(-0.3f, -0.21f, -0.57f, -0.45f, -0.82f, -0.72f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveTo(7.93f, 10.08f, 7.59f, 10.0f, 7.24f, 10.0f)
                curveTo(6.0f, 10.01f, 5.0f, 11.01f, 5.0f, 12.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
