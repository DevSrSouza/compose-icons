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

public val BaselineGroup.HotTub: ImageVector
    get() {
        if (_hotTub != null) {
            return _hotTub!!
        }
        _hotTub = Builder(name = "HotTub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.15f, 12.0f)
                curveToRelative(-0.31f, -0.22f, -0.59f, -0.46f, -0.82f, -0.72f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(6.01f, 9.0f, 5.0f, 10.01f, 5.0f, 11.25f)
                lineTo(5.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(11.15f, 12.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(15.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.65f, 5.86f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineToRelative(-0.11f, 0.59f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f)
                close()
                moveTo(14.65f, 5.86f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineToRelative(-0.11f, 0.59f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f)
                close()
            }
        }
        .build()
        return _hotTub!!
    }

private var _hotTub: ImageVector? = null
