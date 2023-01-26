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

public val RoundGroup.WorkspacePremium: ImageVector
    get() {
        if (_workspacePremium != null) {
            return _workspacePremium!!
        }
        _workspacePremium = Builder(name = "WorkspacePremium", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.92f, 12.75f)
                lineTo(12.0f, 11.93f)
                lineToRelative(1.07f, 0.81f)
                curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f)
                lineToRelative(-0.42f, -1.36f)
                lineToRelative(1.2f, -0.95f)
                curveTo(15.0f, 9.6f, 14.79f, 9.0f, 14.31f, 9.0f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-0.43f, -1.34f)
                curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0.0f)
                lineTo(11.09f, 9.0f)
                horizontalLineTo(9.68f)
                curveTo(9.21f, 9.0f, 9.0f, 9.6f, 9.37f, 9.89f)
                lineToRelative(1.19f, 0.95f)
                lineToRelative(-0.42f, 1.36f)
                curveTo(10.0f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f)
                close()
                moveTo(6.0f, 21.61f)
                curveToRelative(0.0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f)
                lineTo(12.0f, 21.0f)
                lineToRelative(4.68f, 1.56f)
                curveTo(17.33f, 22.78f, 18.0f, 22.3f, 18.0f, 21.61f)
                verticalLineToRelative(-6.33f)
                curveToRelative(1.24f, -1.41f, 2.0f, -3.25f, 2.0f, -5.28f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f)
                verticalLineTo(21.61f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _workspacePremium!!
    }

private var _workspacePremium: ImageVector? = null
