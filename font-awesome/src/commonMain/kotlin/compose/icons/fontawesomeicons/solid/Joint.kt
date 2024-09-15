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

public val SolidGroup.Joint: ImageVector
    get() {
        if (_joint != null) {
            return _joint!!
        }
        _joint = Builder(name = "Joint", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.34f, 181.1f)
                curveToRelative(22.38f, 15.68f, 35.66f, 41.16f, 35.66f, 68.59f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-30.31f)
                curveToRelative(0.0f, -43.24f, -21.01f, -83.41f, -56.34f, -108.06f)
                curveTo(463.85f, 125.02f, 448.0f, 99.34f, 448.0f, 70.31f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                verticalLineToRelative(66.4f)
                curveToRelative(0.0f, 43.69f, 24.56f, 81.63f, 60.34f, 106.7f)
                close()
                moveTo(194.97f, 358.98f)
                curveTo(126.03f, 370.07f, 59.69f, 394.69f, 0.0f, 432.0f)
                curveToRelative(83.65f, 52.28f, 180.3f, 80.0f, 278.94f, 80.0f)
                horizontalLineToRelative(88.57f)
                lineTo(254.79f, 380.49f)
                curveToRelative(-14.74f, -17.2f, -37.45f, -25.11f, -59.82f, -21.51f)
                close()
                moveTo(553.28f, 87.09f)
                curveToRelative(-5.67f, -3.8f, -9.28f, -9.96f, -9.28f, -16.78f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                verticalLineToRelative(62.31f)
                curveToRelative(0.0f, 22.02f, 10.17f, 43.41f, 28.64f, 55.39f)
                curveTo(550.79f, 153.04f, 576.0f, 199.54f, 576.0f, 249.69f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-30.31f)
                curveToRelative(0.0f, -65.44f, -32.41f, -126.19f, -86.72f, -162.6f)
                close()
                moveTo(360.89f, 352.05f)
                curveToRelative(-34.4f, 0.06f, -86.81f, 0.15f, -88.21f, 0.17f)
                lineToRelative(117.8f, 137.43f)
                arcTo(63.99f, 63.99f, 0.0f, false, false, 439.07f, 512.0f)
                horizontalLineToRelative(88.45f)
                lineTo(409.57f, 374.4f)
                arcToRelative(63.96f, 63.96f, 0.0f, false, false, -48.68f, -22.35f)
                close()
                moveTo(616.0f, 352.0f)
                horizontalLineTo(432.0f)
                lineToRelative(117.99f, 137.65f)
                arcTo(63.99f, 63.99f, 0.0f, false, false, 598.58f, 512.0f)
                horizontalLineTo(616.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineTo(376.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
