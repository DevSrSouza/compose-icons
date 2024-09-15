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

public val SolidGroup.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.65f, 0.0f)
                curveToRelative(23.63f, 0.0f, 43.83f, 20.65f, 43.83f, 44.8f)
                verticalLineToRelative(99.85f)
                curveToRelative(17.05f, -16.34f, 49.77f, -18.35f, 70.94f, 6.3f)
                curveToRelative(22.83f, -14.29f, 53.02f, -2.15f, 62.31f, 16.45f)
                curveTo(361.88f, 158.43f, 384.0f, 189.35f, 384.0f, 240.0f)
                curveToRelative(0.0f, 2.75f, -0.2f, 13.28f, -0.19f, 16.0f)
                curveToRelative(0.17f, 61.97f, -31.07f, 76.89f, -38.31f, 123.73f)
                curveTo(343.68f, 391.4f, 333.6f, 400.0f, 321.79f, 400.0f)
                lineTo(150.26f, 400.0f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-18.37f, -0.01f, -35.89f, -10.61f, -43.85f, -28.46f)
                curveTo(93.42f, 342.65f, 57.38f, 276.12f, 29.09f, 264.0f)
                curveTo(10.9f, 256.2f, 0.01f, 242.62f, 0.0f, 224.0f)
                curveToRelative(-0.01f, -34.22f, 35.1f, -57.75f, 66.91f, -44.12f)
                curveToRelative(8.36f, 3.58f, 16.67f, 8.31f, 24.92f, 14.15f)
                lineTo(91.83f, 44.8f)
                curveToRelative(0.0f, -23.45f, 20.54f, -44.8f, 43.83f, -44.8f)
                close()
                moveTo(136.0f, 416.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                lineTo(136.0f, 512.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(304.0f, 444.0f)
                curveToRelative(-11.05f, 0.0f, -20.0f, 8.95f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.95f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.95f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-8.95f, -20.0f, -20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
