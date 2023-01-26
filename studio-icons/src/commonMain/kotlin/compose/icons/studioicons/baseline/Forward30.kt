package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Forward30: ImageVector
    get() {
        if (_forward30 != null) {
            return _forward30!!
        }
        _forward30 = Builder(name = "Forward30", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-5.0f, -5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.06f, 15.38f)
                curveToRelative(-0.29f, 0.0f, -0.62f, -0.17f, -0.62f, -0.54f)
                horizontalLineTo(8.59f)
                curveToRelative(0.0f, 0.97f, 0.9f, 1.23f, 1.45f, 1.23f)
                curveToRelative(0.87f, 0.0f, 1.51f, -0.46f, 1.51f, -1.25f)
                curveToRelative(0.0f, -0.66f, -0.45f, -0.9f, -0.71f, -1.0f)
                curveToRelative(0.11f, -0.05f, 0.65f, -0.32f, 0.65f, -0.92f)
                curveToRelative(0.0f, -0.21f, -0.05f, -1.22f, -1.44f, -1.22f)
                curveToRelative(-0.62f, 0.0f, -1.4f, 0.35f, -1.4f, 1.16f)
                horizontalLineToRelative(0.85f)
                curveToRelative(0.0f, -0.34f, 0.31f, -0.48f, 0.57f, -0.48f)
                curveToRelative(0.59f, 0.0f, 0.58f, 0.5f, 0.58f, 0.54f)
                curveToRelative(0.0f, 0.52f, -0.41f, 0.59f, -0.63f, 0.59f)
                horizontalLineTo(9.56f)
                verticalLineToRelative(0.66f)
                horizontalLineToRelative(0.45f)
                curveToRelative(0.65f, 0.0f, 0.7f, 0.42f, 0.7f, 0.64f)
                curveTo(10.71f, 15.11f, 10.5f, 15.38f, 10.06f, 15.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.85f, 11.68f)
                curveToRelative(-0.14f, 0.0f, -1.44f, -0.08f, -1.44f, 1.82f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f)
                curveToRelative(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f)
                verticalLineTo(13.5f)
                curveTo(15.3f, 11.59f, 13.99f, 11.68f, 13.85f, 11.68f)
                close()
                moveTo(14.45f, 14.35f)
                curveToRelative(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f)
                curveToRelative(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f)
                curveToRelative(0.38f, 0.0f, 0.6f, 0.26f, 0.6f, 1.01f)
                verticalLineTo(14.35f)
                close()
            }
        }
        .build()
        return _forward30!!
    }

private var _forward30: ImageVector? = null
