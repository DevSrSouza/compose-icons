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

public val SimpleIcons.Elastic: ImageVector
    get() {
        if (_elastic != null) {
            return _elastic!!
        }
        _elastic = Builder(name = "Elastic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.345f, 16.33f)
                lineToRelative(-3.959f, -0.926f)
                lineToRelative(-1.05f, -2.01f)
                lineToRelative(5.177f, -4.535f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, true, 2.559f, 3.702f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -2.727f, 3.77f)
                moveToRelative(-2.976f, 4.68f)
                curveToRelative(-0.616f, 0.0f, -1.22f, -0.207f, -1.714f, -0.587f)
                lineToRelative(0.782f, -4.077f)
                lineToRelative(3.596f, 0.841f)
                curveToRelative(0.115f, 0.31f, 0.172f, 0.642f, 0.172f, 0.987f)
                arcToRelative(2.839f, 2.839f, 0.0f, false, true, -2.836f, 2.836f)
                moveToRelative(-2.637f, -0.586f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, true, -4.908f, 2.6f)
                arcTo(5.947f, 5.947f, 0.0f, false, true, 4.0f, 15.905f)
                lineToRelative(5.167f, -4.67f)
                lineToRelative(5.272f, 2.403f)
                lineToRelative(1.167f, 2.23f)
                close()
                moveTo(0.928f, 11.443f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, 2.726f, -3.77f)
                lineToRelative(3.95f, 0.933f)
                lineToRelative(0.927f, 1.98f)
                lineToRelative(-5.05f, 4.565f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -2.553f, -3.708f)
                moveToRelative(5.703f, -8.45f)
                arcToRelative(2.841f, 2.841f, 0.0f, false, true, 1.723f, 0.58f)
                lineToRelative(-0.789f, 4.092f)
                lineToRelative(-3.598f, -0.85f)
                arcToRelative(2.842f, 2.842f, 0.0f, false, true, -0.172f, -0.986f)
                arcTo(2.84f, 2.84f, 0.0f, false, true, 6.63f, 2.992f)
                moveToRelative(2.66f, 0.59f)
                arcTo(5.92f, 5.92f, 0.0f, false, true, 20.1f, 6.93f)
                curveToRelative(0.0f, 0.4f, -0.038f, 0.781f, -0.114f, 1.164f)
                lineToRelative(-5.299f, 4.643f)
                lineToRelative(-5.251f, -2.394f)
                lineToRelative(-1.026f, -2.19f)
                close()
                moveTo(24.0f, 12.571f)
                arcToRelative(4.723f, 4.723f, 0.0f, false, false, -3.124f, -4.454f)
                arcToRelative(6.695f, 6.695f, 0.0f, false, false, 0.126f, -1.29f)
                arcTo(6.789f, 6.789f, 0.0f, false, false, 14.22f, 0.047f)
                arcTo(6.769f, 6.769f, 0.0f, false, false, 8.727f, 2.86f)
                arcToRelative(3.586f, 3.586f, 0.0f, false, false, -2.204f, -0.754f)
                arcTo(3.604f, 3.604f, 0.0f, false, false, 3.15f, 6.959f)
                arcTo(4.786f, 4.786f, 0.0f, false, false, 0.0f, 11.431f)
                arcTo(4.727f, 4.727f, 0.0f, false, false, 3.139f, 15.9f)
                arcToRelative(6.876f, 6.876f, 0.0f, false, false, -0.124f, 1.289f)
                arcToRelative(6.773f, 6.773f, 0.0f, false, false, 6.765f, 6.765f)
                curveToRelative(2.19f, 0.0f, 4.22f, -1.052f, 5.49f, -2.824f)
                arcToRelative(3.568f, 3.568f, 0.0f, false, false, 2.207f, 0.769f)
                arcToRelative(3.603f, 3.603f, 0.0f, false, false, 3.374f, -4.854f)
                arcTo(4.785f, 4.785f, 0.0f, false, false, 24.0f, 12.572f)
            }
        }
        .build()
        return _elastic!!
    }

private var _elastic: ImageVector? = null
