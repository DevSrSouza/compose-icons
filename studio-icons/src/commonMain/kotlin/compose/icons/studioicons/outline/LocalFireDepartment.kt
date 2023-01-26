package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.LocalFireDepartment: ImageVector
    get() {
        if (_localFireDepartment != null) {
            return _localFireDepartment!!
        }
        _localFireDepartment = Builder(name = "LocalFireDepartment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineToRelative(-0.44f, 0.55f)
                curveToRelative(-0.42f, 0.52f, -0.98f, 0.75f, -1.54f, 0.75f)
                curveTo(13.0f, 7.3f, 12.0f, 6.52f, 12.0f, 5.3f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(20.0f, 10.04f, 18.39f, 7.38f, 16.0f, 6.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.87f, -2.0f, -1.94f)
                curveToRelative(0.0f, -0.51f, 0.2f, -0.99f, 0.58f, -1.36f)
                lineToRelative(1.42f, -1.4f)
                lineToRelative(1.43f, 1.4f)
                curveTo(13.8f, 16.07f, 14.0f, 16.55f, 14.0f, 17.06f)
                curveTo(14.0f, 18.13f, 13.1f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(15.96f, 17.5f)
                lineTo(15.96f, 17.5f)
                curveToRelative(0.04f, -0.36f, 0.22f, -1.89f, -1.13f, -3.22f)
                lineToRelative(0.0f, 0.0f)
                lineTo(12.0f, 11.5f)
                lineToRelative(-2.83f, 2.78f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-1.36f, 1.34f, -1.17f, 2.88f, -1.13f, 3.22f)
                curveTo(6.79f, 16.4f, 6.0f, 14.79f, 6.0f, 13.0f)
                curveToRelative(0.0f, -3.16f, 2.13f, -5.65f, 4.03f, -7.25f)
                curveToRelative(0.23f, 1.99f, 1.93f, 3.55f, 3.99f, 3.55f)
                curveToRelative(0.78f, 0.0f, 1.54f, -0.23f, 2.18f, -0.66f)
                curveTo(17.34f, 9.78f, 18.0f, 11.35f, 18.0f, 13.0f)
                curveTo(18.0f, 14.79f, 17.21f, 16.4f, 15.96f, 17.5f)
                close()
            }
        }
        .build()
        return _localFireDepartment!!
    }

private var _localFireDepartment: ImageVector? = null
