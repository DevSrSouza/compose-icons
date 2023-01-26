package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ModelTraining: ImageVector
    get() {
        if (_modelTraining != null) {
            return _modelTraining!!
        }
        _modelTraining = Builder(name = "ModelTraining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 13.5f)
                curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f)
                close()
                moveTo(13.0f, 19.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(19.5f)
                close()
                moveTo(19.0f, 13.0f)
                curveToRelative(0.0f, 1.39f, -0.41f, 2.69f, -1.12f, 3.78f)
                curveToRelative(-0.25f, 0.39f, -0.19f, 0.91f, 0.14f, 1.24f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.44f, 0.44f, 1.2f, 0.38f, 1.54f, -0.15f)
                curveTo(20.47f, 16.47f, 21.0f, 14.8f, 21.0f, 13.0f)
                curveToRelative(0.0f, -2.36f, -0.91f, -4.51f, -2.4f, -6.12f)
                curveToRelative(-0.39f, -0.42f, -1.05f, -0.43f, -1.45f, -0.03f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, -0.02f, 1.39f)
                curveTo(18.29f, 9.49f, 19.0f, 11.16f, 19.0f, 13.0f)
                close()
                moveTo(15.65f, 4.65f)
                lineToRelative(-2.79f, -2.79f)
                curveTo(12.54f, 1.54f, 12.0f, 1.76f, 12.0f, 2.21f)
                verticalLineTo(4.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                curveToRelative(0.0f, 1.8f, 0.53f, 3.47f, 1.44f, 4.88f)
                curveToRelative(0.34f, 0.53f, 1.1f, 0.59f, 1.54f, 0.15f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.33f, -0.33f, 0.39f, -0.84f, 0.14f, -1.23f)
                curveTo(4.73f, 14.65f, 4.48f, 11.7f, 6.25f, 8.8f)
                curveTo(7.45f, 6.85f, 9.71f, 5.81f, 12.0f, 6.0f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.79f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveTo(15.84f, 5.16f, 15.84f, 4.84f, 15.65f, 4.65f)
                close()
            }
        }
        .build()
        return _modelTraining!!
    }

private var _modelTraining: ImageVector? = null
