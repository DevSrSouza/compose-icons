package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Verified: ImageVector
    get() {
        if (_verified != null) {
            return _verified!!
        }
        _verified = Builder(name = "Verified", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.99f)
                lineToRelative(-2.44f, -2.79f)
                lineToRelative(0.34f, -3.69f)
                lineToRelative(-3.61f, -0.82f)
                lineTo(15.4f, 1.5f)
                lineTo(12.0f, 2.96f)
                lineTo(8.6f, 1.5f)
                lineTo(6.71f, 4.69f)
                lineTo(3.1f, 5.5f)
                lineTo(3.44f, 9.2f)
                lineTo(1.0f, 11.99f)
                lineToRelative(2.44f, 2.79f)
                lineToRelative(-0.34f, 3.7f)
                lineToRelative(3.61f, 0.82f)
                lineTo(8.6f, 22.5f)
                lineToRelative(3.4f, -1.47f)
                lineToRelative(3.4f, 1.46f)
                lineToRelative(1.89f, -3.19f)
                lineToRelative(3.61f, -0.82f)
                lineToRelative(-0.34f, -3.69f)
                lineTo(23.0f, 11.99f)
                close()
                moveTo(19.05f, 13.47f)
                lineToRelative(-0.56f, 0.65f)
                lineToRelative(0.08f, 0.85f)
                lineToRelative(0.18f, 1.95f)
                lineToRelative(-1.9f, 0.43f)
                lineToRelative(-0.84f, 0.19f)
                lineToRelative(-0.44f, 0.74f)
                lineToRelative(-0.99f, 1.68f)
                lineToRelative(-1.78f, -0.77f)
                lineTo(12.0f, 18.85f)
                lineToRelative(-0.79f, 0.34f)
                lineToRelative(-1.78f, 0.77f)
                lineToRelative(-0.99f, -1.67f)
                lineToRelative(-0.44f, -0.74f)
                lineToRelative(-0.84f, -0.19f)
                lineToRelative(-1.9f, -0.43f)
                lineToRelative(0.18f, -1.96f)
                lineToRelative(0.08f, -0.85f)
                lineToRelative(-0.56f, -0.65f)
                lineToRelative(-1.29f, -1.47f)
                lineToRelative(1.29f, -1.48f)
                lineToRelative(0.56f, -0.65f)
                lineTo(5.43f, 9.01f)
                lineTo(5.25f, 7.07f)
                lineToRelative(1.9f, -0.43f)
                lineToRelative(0.84f, -0.19f)
                lineToRelative(0.44f, -0.74f)
                lineToRelative(0.99f, -1.68f)
                lineToRelative(1.78f, 0.77f)
                lineTo(12.0f, 5.14f)
                lineToRelative(0.79f, -0.34f)
                lineToRelative(1.78f, -0.77f)
                lineToRelative(0.99f, 1.68f)
                lineToRelative(0.44f, 0.74f)
                lineToRelative(0.84f, 0.19f)
                lineToRelative(1.9f, 0.43f)
                lineToRelative(-0.18f, 1.95f)
                lineToRelative(-0.08f, 0.85f)
                lineToRelative(0.56f, 0.65f)
                lineToRelative(1.29f, 1.47f)
                lineTo(19.05f, 13.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.09f, 13.75f)
                lineToRelative(-2.32f, -2.33f)
                lineToRelative(-1.48f, 1.49f)
                lineToRelative(3.8f, 3.81f)
                lineToRelative(7.34f, -7.36f)
                lineToRelative(-1.48f, -1.49f)
                close()
            }
        }
        .build()
        return _verified!!
    }

private var _verified: ImageVector? = null
