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

public val SolidGroup.HandPointRight: ImageVector
    get() {
        if (_handPointRight != null) {
            return _handPointRight!!
        }
        _handPointRight = Builder(name = "HandPointRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 199.65f)
                curveToRelative(0.0f, 23.63f, -20.65f, 43.83f, -44.8f, 43.83f)
                horizontalLineToRelative(-99.85f)
                curveToRelative(16.34f, 17.05f, 18.35f, 49.77f, -6.3f, 70.94f)
                curveToRelative(14.29f, 22.83f, 2.15f, 53.02f, -16.45f, 62.31f)
                curveTo(353.57f, 425.88f, 322.65f, 448.0f, 272.0f, 448.0f)
                curveToRelative(-2.75f, 0.0f, -13.28f, -0.2f, -16.0f, -0.19f)
                curveToRelative(-61.97f, 0.17f, -76.89f, -31.07f, -123.73f, -38.31f)
                curveTo(120.6f, 407.68f, 112.0f, 397.6f, 112.0f, 385.79f)
                verticalLineTo(214.26f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.01f, -18.37f, 10.61f, -35.89f, 28.46f, -43.85f)
                curveToRelative(28.89f, -12.99f, 95.41f, -49.04f, 107.53f, -77.32f)
                curveToRelative(7.8f, -18.19f, 21.38f, -29.08f, 40.0f, -29.09f)
                curveToRelative(34.22f, -0.01f, 57.75f, 35.1f, 44.12f, 66.91f)
                curveToRelative(-3.58f, 8.36f, -8.31f, 16.67f, -14.15f, 24.92f)
                horizontalLineTo(467.2f)
                curveToRelative(23.45f, 0.0f, 44.8f, 20.54f, 44.8f, 43.83f)
                close()
                moveTo(96.0f, 200.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                verticalLineTo(200.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                close()
                moveTo(68.0f, 368.0f)
                curveToRelative(0.0f, -11.05f, -8.95f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.95f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.95f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.95f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointRight!!
    }

private var _handPointRight: ImageVector? = null
