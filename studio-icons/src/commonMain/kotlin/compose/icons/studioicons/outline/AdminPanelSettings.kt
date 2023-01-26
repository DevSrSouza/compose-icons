package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val OutlineGroup.AdminPanelSettings: ImageVector
    get() {
        if (_adminPanelSettings != null) {
            return _adminPanelSettings!!
        }
        _adminPanelSettings = Builder(name = "AdminPanelSettings", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 15.5f)
                moveToRelative(-1.12f, 0.0f)
                arcToRelative(1.12f, 1.12f, 0.0f, true, true, 2.24f, 0.0f)
                arcToRelative(1.12f, 1.12f, 0.0f, true, true, -2.24f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 17.5f)
                curveToRelative(-0.73f, 0.0f, -2.19f, 0.36f, -2.24f, 1.08f)
                curveToRelative(0.5f, 0.71f, 1.32f, 1.17f, 2.24f, 1.17f)
                reflectiveCurveToRelative(1.74f, -0.46f, 2.24f, -1.17f)
                curveTo(19.19f, 17.86f, 17.73f, 17.5f, 17.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 11.09f)
                verticalLineTo(6.27f)
                lineTo(10.5f, 3.0f)
                lineTo(3.0f, 6.27f)
                verticalLineToRelative(4.91f)
                curveToRelative(0.0f, 4.54f, 3.2f, 8.79f, 7.5f, 9.82f)
                curveToRelative(0.55f, -0.13f, 1.08f, -0.32f, 1.6f, -0.55f)
                curveTo(13.18f, 21.99f, 14.97f, 23.0f, 17.0f, 23.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                curveTo(23.0f, 14.03f, 20.84f, 11.57f, 18.0f, 11.09f)
                close()
                moveTo(11.0f, 17.0f)
                curveToRelative(0.0f, 0.56f, 0.08f, 1.11f, 0.23f, 1.62f)
                curveToRelative(-0.24f, 0.11f, -0.48f, 0.22f, -0.73f, 0.3f)
                curveToRelative(-3.17f, -1.0f, -5.5f, -4.24f, -5.5f, -7.74f)
                verticalLineToRelative(-3.6f)
                lineToRelative(5.5f, -2.4f)
                lineToRelative(5.5f, 2.4f)
                verticalLineToRelative(3.51f)
                curveTo(13.16f, 11.57f, 11.0f, 14.03f, 11.0f, 17.0f)
                close()
                moveTo(17.0f, 21.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveTo(21.0f, 19.21f, 19.21f, 21.0f, 17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _adminPanelSettings!!
    }

private var _adminPanelSettings: ImageVector? = null
