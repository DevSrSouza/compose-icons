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

public val BaselineGroup.SportsMma: ImageVector
    get() {
        if (_sportsMma != null) {
            return _sportsMma!!
        }
        _sportsMma = Builder(name = "SportsMma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 0.13f, 0.01f, 0.26f, 0.04f, 0.39f)
                lineToRelative(0.8f, 4.0f)
                curveToRelative(0.09f, 0.47f, 0.5f, 0.8f, 0.98f, 0.8f)
                horizontalLineToRelative(10.36f)
                curveToRelative(0.45f, 0.0f, 0.89f, -0.36f, 0.98f, -0.8f)
                lineToRelative(0.8f, -4.0f)
                curveTo(18.99f, 11.06f, 19.0f, 10.93f, 19.0f, 10.8f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _sportsMma!!
    }

private var _sportsMma: ImageVector? = null
